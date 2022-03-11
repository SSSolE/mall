<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<form action="http://mall.com/productMng" name="newProduct" class="form-horizontal" method="POST" enctype="multipart/form-data">
	<div class="form-group row">
		<label class="col-sm-2">상품 코드</label>
		<div class="col-sm-3">
			<input type="text" name="productId" id="productId" class="form-control" maxlength="5" size="5">
		</div>
	</div>

	<div class="form-group row">
		<label class="col-sm-2">상품 명</label>
		<div class="col-sm-3">
			<input type="text" name="name" id="name" class="form-control" maxlength="255" size="255">
		</div>
	</div>
	
	<div class="form-group row">
		<label class="col-sm-2">상품 가격</label>
		<div class="col-sm-3">
			 <input type="number" name="unitPrice" id="unitPrice" class="form-control" min="0" max="10000000">
		</div>
	</div>
	
	<div class="form-group row">
		<label class="col-sm-2">상품 상세 정보</label>
		<div class="col-sm-5">
			<textarea name="description" rows="10" cols="50" class="form-control"></textarea>
		</div>
	</div>
	
	<div class="form-group row">
		<label class="col-sm-2">제조사</label>
		<div class="col-sm-3">
			<input type="text" name="manufacturer" class="form-control">
		</div>
	</div>
	
	<div class="form-group row">
		<label class="col-sm-2">분류</label>
		<div class="col-sm-3">
			<input type="text" name="category" class="form-control">
		</div>
	</div>
	
	<div class="form-group row">
		<label class="col-sm-2">재고 수</label>
		<div class="col-sm-3">
			<input type="range" name="unitsInStock" id="unitsInStock" class="form-control">
		</div>
	</div>
	
	<div class="form-group row">
		<label class="col-sm-2">상태</label>
		<div class="col-sm-5">
			<label><input type="radio" name="condition" value="new">새제품</label>
			<label><input type="radio" name="condition" value="old">중고제품</label>
			<label><input type="radio" name="condition" value="refurbished">리퍼제품</label>
		</div>
	</div>
	
	<div class="form-group row">
		<label class="col-sm-2">상품 이미지</label>
		<div class="col-sm-5">
			<input type="file" name="productImage" class="form-control">
		</div>
	</div>
	
	<div class="form-group row">
		<div class="col-sm-offset-2 col-sm-10">
			<input type="button" class="btn btn-primary" value="등록" onclick="checkAddProduct()">
			<input type="reset" class="btn btn-danger" value="초기화">
		</div>
	</div>
</form>

<script>
	function checkAddProduct() {
		// 상품을 등록할 때 필요한
		// 입력값 검증
		
		// 검증이 완료됬다 로 가정
		
		// 검증이 완료됬으므로 상품을 등록하기 위해
		// 서버로 입력한 값을 보냄
		document.newProduct.submit();
	}
</script>