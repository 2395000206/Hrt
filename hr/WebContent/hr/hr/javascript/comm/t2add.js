 $(function(){
 
	  		    	$.ajax({
		    		type:'POST',
		    		url:'../../../../hr/hr/page/client/first_kindctr',
		    		dataType:'json',
		    		contentType:'application/json; charset=utf-8',
	         	success:function(data){
		    		var html="";
		   
		    		
		    		for(var i=0;i<data.total;i++){
		    			html+='<option value="'+data.rows[i].ffk_id+'">'+data.rows[i].first_kind_name+'</option>';		
                    	} 
		    		
		    		$("#firstKindId").append(html);
		    				
		    		}
		    	});

	   }) 