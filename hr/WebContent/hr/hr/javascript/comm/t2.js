   $(function(){
 
	  		    	$.ajax({
		    		type:'POST',
		    		url:'../../../../hr/hr/page/client/second_kindstr',
		    		dataType:'json',
		    		contentType:'application/json; charset=utf-8',
	         	success:function(data){
		    		var html="";
		   
		    		
		    		for(var i=0;i<data.total;i++){
		    		 
		    		 html+='<tr><td class="TD_STYLE2">'+data.rows[i].first_kind_name+'</td>';
		    	     html+='<td class="TD_STYLE2">'+data.rows[i].second_kind_id+'</td>';
		             html+='<td class="TD_STYLE2">'+data.rows[i].second_kind_name+'</td>';
		    		 html+='<td class="TD_STYLE2">'+data.rows[i].second_salary_id+'</td>';
		         	 html+='<td class="TD_STYLE2">'+data.rows[i].second_sale_id+'</td>';
		             html+='<td class="TD_STYLE2"> <a href="../../../../hr/hr/page/client/second_kind_changectr?fsk_id='+data.rows[i].fsk_id+'">变更</a> </td> <td class="TD_STYLE2"> <a href="../../../../hr/hr/page/client/second_delete_successctr2?fsk_id='+data.rows[i].fsk_id+'">删除</a></td> </tr>';
		    		} 
		    		
		    		$(".TABLE_STYLE1").append(html);
		    				
		    		}
		    	});

	   }) 