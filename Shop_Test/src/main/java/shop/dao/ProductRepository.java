package shop.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import shop.dto.Product;

public class ProductRepository extends JDBConnection {
	
	/**
	 * 상품 목록
	 * @return
	 */
	public List<Product> list() {
		List<Product> productList = new ArrayList<Product>();
		
		// SQL 작성
		String sql = " SELECT * "
				+ " FROM product ";
		
		try {	
			stmt = con.createStatement();
			
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				Product product = new Product();
				
				product.setProductId(rs.getString("product_id"));
                product.setName(rs.getString("name"));
                product.setUnitPrice(rs.getInt("unit_price"));
                product.setDescription(rs.getString("description"));
                product.setManufacturer(rs.getString("manufacturer"));
                product.setCategory(rs.getString("category"));
                product.setUnitsInStock(rs.getLong("units_in_stock"));
                product.setCondition(rs.getString("condition"));
                product.setFile(rs.getString("file"));
                product.setQuantity(rs.getInt("quantity"));

                productList.add(product);
			} 
		} catch(SQLException e) {
			   System.err.println("상품 목록 조회 시, 예외 발생");
			   e.printStackTrace();
		} 
		return productList;
	}
	
	
	/**
	 * 상품 목록 검색
	 * @param keyword
	 * @return
	 */
	public List<Product> list(String keyword) {
		List<Product> productList = new ArrayList<Product>();
		
		String sql = " SELECT * "
				+ " FROM product "
				+ " WHERE name LIKE ? "
				+ " OR description LIKE ? "
				+ " OR manufacturer LIKE ? "
				+ " OR category LIKE ? ";
		
		try {
			psmt = con.prepareStatement(sql);
			
			String likeKeyword = "%" + keyword + "%";
            psmt.setString(1, likeKeyword);
            psmt.setString(2, likeKeyword);
            psmt.setString(3, likeKeyword);
            psmt.setString(4, likeKeyword);
			
			rs = psmt.executeQuery();
			
			while( rs.next() ) {
				Product product = new Product();
				
				product.setProductId(rs.getString("product_id"));
                product.setName(rs.getString("name"));
                product.setUnitPrice(rs.getInt("unit_price"));
                product.setDescription(rs.getString("description"));
                product.setManufacturer(rs.getString("manufacturer"));
                product.setCategory(rs.getString("category"));
                product.setUnitsInStock(rs.getLong("units_in_stock"));
                product.setCondition(rs.getString("condition"));
                product.setFile(rs.getString("file"));
                product.setQuantity(rs.getInt("quantity"));

                productList.add(product);
			} 
		} catch (SQLException e) {
			e.printStackTrace();
			System.err.println("상품 목록 검색 중 에러가 발생하였습니다.");
		}
		return productList;
	}
	
	
	/**
	 * 상품 조회
	 * @param productId
	 * @return
	 */
	public Product getProductById(String productId) {
		Product product = new Product();
		
		String sql = "SELECT * "
	            + "FROM product "
	            + "WHERE product_id = ? ";

		try {
			psmt = con.prepareStatement(sql);
			psmt.setString(1, productId);
			rs = psmt.executeQuery();
			
			if( rs.next() ) {
				
				product.setProductId(rs.getString("product_id"));
                product.setName(rs.getString("name"));
                product.setUnitPrice(rs.getInt("unit_price"));
                product.setDescription(rs.getString("description"));
                product.setManufacturer(rs.getString("manufacturer"));
                product.setCategory(rs.getString("category"));
                product.setUnitsInStock(rs.getLong("units_in_stock"));
                product.setCondition(rs.getString("condition"));
                product.setFile(rs.getString("file"));
                product.setQuantity(rs.getInt("quantity"));

			} 
		} catch (SQLException e) {
			e.printStackTrace();
			System.err.println("상품 목록 검색 중 에러가 발생하였습니다.");
		}
		return product;
	}
	
	
	
	/**
	 * 상품 등록
	 * @param product
	 * @return
	 */
	public int insert(Product product) {
		int result = 0;
		
		String sql = " INSERT INTO product (file, product_id, name, unit_price, description, manufacturer, category, units_in_stock, `condition`) "
				   + " VALUES( ?, ?, ?, ?, ?, ?, ?, ?, ? ) ";
	
		try {
			psmt = con.prepareStatement(sql);
			psmt.setString( 1, product.getFile());
			psmt.setString( 2, product.getProductId());
			psmt.setString( 3, product.getName());
			psmt.setInt( 4, product.getUnitPrice());
			psmt.setString( 5, product.getDescription());
			psmt.setString( 6, product.getManufacturer());
			psmt.setString( 7, product.getCategory());
			psmt.setLong( 8, product.getUnitsInStock());
			psmt.setString( 9, product.getCondition());
		
			result = psmt.executeUpdate();
		} catch (SQLException e) {
			System.err.println("상품 등록 시, 예외 발생");
			e.printStackTrace();
		}
		return result;
	}
	
	
	/**
	 * 상품 수정
	 * @param product
	 * @return
	 */
	public int update(Product product) {
		int result = 0;
		
		String sql = " UPDATE product "
				+ " SET file = ? "
				+ " , product_id = ?"
				+ " , name = ? "
				+ " , unit_price = ? "
				+ " , description = ? "
				+ " , manufacturer = ? "
				+ " , category = ? "
				+ " , units_in_stock = ? "
				+ " , `condition` = ? "
				+ " WHERE product_id = ? ";
		
		try {
			psmt = con.prepareStatement(sql);
			
			 psmt.setString( 1, product.getFile());
		        psmt.setString( 2, product.getProductId());
		        psmt.setString( 3, product.getName());
		        psmt.setInt( 4, product.getUnitPrice());
		        psmt.setString( 5, product.getDescription());
		        psmt.setString( 6, product.getManufacturer());
		        psmt.setString( 7, product.getCategory());
		        psmt.setLong( 8, product.getUnitsInStock());
		        psmt.setString( 9, product.getCondition());
		        psmt.setString(10, product.getProductId());
		
			result = psmt.executeUpdate();
		} catch (SQLException e) {
			System.err.println("상품 수정 시, 예외 발생");
			e.printStackTrace();
		}
		return result;
	}

	
	
	
	/**
	 * 상품 삭제
	 * @param product
	 * @return
	 */
	public int delete(String productId) {
		int result = 0;
		String sql = " DELETE "
				+ " FROM product "
				+ " WHERE product_id = ? ";
		try {
			psmt = con.prepareStatement(sql);
			psmt.setString(1, productId);
			result = psmt.executeUpdate();
		
		
		} catch (SQLException e) {
			e.printStackTrace();
			System.err.println("상품 삭제 중 에러 발생");
		}
		return result;
	}

}





























