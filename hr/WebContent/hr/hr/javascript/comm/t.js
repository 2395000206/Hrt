   $(function(){
	  		    	$.ajax({
		    		type:'POST',
		    		url:'../../../../hr/hr/page/client/first_kindctr',
		    		dataType:'json',
		    		contentType:'application/json; charset=utf-8',
	         	success:function(data){
		    		var html="";
		   
		    		
		    		for(var i=0;i<data.total;i++){
		    			html+='<tr> <td class="TD_STYLE2"> '+data.rows[i].first_kind_id+' </td> <td class="TD_STYLE2">'+data.rows[i].first_kind_name+' </td> <td class="TD_STYLE2">'+data.rows[i].first_kind_salary_id+' </td> <td class="TD_STYLE2">'+data.rows[i].first_kind_sale_id+' </td> <td class="TD_STYLE2"> <a href="../../../../hr/hr/page/client/first_kind_changectr?ffk_id='+data.rows[i].first_kind_id+'">变更</a> </td> <td class="TD_STYLE2"> <a href="../../../../hr/hr/page/client/second_delete_successctr?ffk_id='+data.rows[i].first_kind_id+'">删除</a> </td> </tr>';
		    		}
		    		$(".TABLE_STYLE1").append(html);
		    				
		    		}
		    	});

	   }) 