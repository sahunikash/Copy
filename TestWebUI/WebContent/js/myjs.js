$(document).ready(function() {
	$("#button").click(function() {
		var name = $("#name").val();
		var time = $("#time").val();
		var location = $("#location").val();
		var price = $("#price").val();
		var url ="http://localhost:8081/TestRest/user/create"; 
		var requestData= {
			"name":name,
			"time":time,
			"location":location,
			"price":price
		};
		
		$.ajax({
	        type: 'POST',
	        contentType: 'application/json',
	        url: url,
	        dataType: "json",
	        data: JSON.stringify(requestData),
	        success: function(data){
	            alert('Wine created successfully'+ data.status);
	        },
	        error: function(data){
	        	console.log(data.status);
	            alert('addWine error: '+data.status);
	        }
	    });
		
	});
});


