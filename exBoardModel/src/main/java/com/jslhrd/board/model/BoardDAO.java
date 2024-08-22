package com.jslhrd.board.model;

import java.sql.*;
import java.util.*;

import com.jslhrd.util.DBManager;

public class BoardDAO {
	//싱글톤
	private BoardDAO() {}
	private static BoardDAO instance = new BoardDAO();
	public static BoardDAO getInstance() {
		return instance;
	}
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	//메소드 작성
	//게시글 전체 글수 카운트
	public int boardCount() {
		int cnt = 0;
		String sql="select count(*) from tbl_board";
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				cnt = rs.getInt(1);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		return cnt;
	}
	
	//게시글 전체 목록
    public List<BoardDTO> selectAllBoards() {
        List<BoardDTO> boardList = new ArrayList<>();
        String sql = "SELECT * FROM tbl_board ORDER BY idx DESC";
        try {
            conn = DBManager.getConnection();
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                BoardDTO board = new BoardDTO();
                board.setIdx(rs.getInt("idx"));
                board.setPass(rs.getString("pass"));
                board.setName(rs.getString("name"));
                board.setEmail(rs.getString("email"));
                board.setSubject(rs.getString("subject"));
                board.setContents(rs.getString("contents"));
                board.setRegdate(rs.getString("regdate"));
                board.setReadcnt(rs.getInt("readcnt"));

                boardList.add(board);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBManager.close(conn, pstmt, rs);
        }
        return boardList;
    }
	

	
}
