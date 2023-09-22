<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<script type="text/javascript">
   
     $(document).ready(function(){
    	 
    	 //yyy이벤트 처리
    	 //"json" => LoginDTO로 만들어야하니까 data를 json으로 보낸다.
    	 //이때 문자열로 된 제이슨이라는게 중요하다! "json"
    	 $("#yyy").on("click", function(){
    		//ajax
			 $.ajax({
				 url:'yyy',
				 type:"post",
				 dataType:"text", //응답데이터 타입
				 headers:{      //요청 데이터 타입
					 "Content-Type":"application/json"
				 },
				 //전달할 데이터
				 data:JSON.stringify({userid:"홍길동",passwd:"1234"}),  //문자열로 보내기 위해 stringify 
				 success:function(data,status,xhr){
				 },
				 error:function(xhr, status, error){
					 
				 }
		 	});//end ajax
    	 
    	});//end yyy
    	
    	
    	//yyy이벤트 처리 "json" => LoginDTO
    	//ArrayList
    	 $("#zzz").on("click", function(){
    		//ajax
			 $.ajax({
				 url:'zzz',
				 type:"post",
				 dataType:"text", //응답데이터 타입
				 headers:{      //요청 데이터 타입
					 "Content-Type":"application/json"
				 },
				 //전달할 데이터
				 data:JSON.stringify([{userid:"홍길동",passwd:"1234"},{userid:"홍길동2",passwd:"5678"}]),  //문자열로 보내기 위해 stringify 
				 success:function(data,status,xhr){
				 },
				 error:function(xhr, status, error){
					 
				 }
		 	});//end ajax
    	 
    	});//end zzz
    		
     });//end ready

</script>
</head>
<body>
<button id="yyy">yyy</button>
<button id="zzz">zzz</button>
</body>
</html>