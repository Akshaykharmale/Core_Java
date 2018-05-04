	
		function checkName(e){
			var element=e.target;
			if(/[^a-zA-Z]/.test(element.value)){
				alert("Name is invalid! \nOnly characters from a-z and A-Z are allowed.");
				element.value="";
				return false;
			}
			if(element.value.length<4){
				alert("Name is too Short \nEnter minimum 4 letters");
				element.value="";
				return false;
			}
			return true;
		}

		function checkMail(e)
		      {
				   var element=e.target;
				   if(/[^a-zA-Z0-9.@]/.test(element.value))
		          {

		            alert(" Invalid Email! ");
		            element.value="";
		            return false;

		          }

		         
		          if(!/[@]/.test(element.value))
		          {

		            alert(" Invalid email! @ missing ");
		            element.value="";
		            return false;

		          }

		          if(!/[.]/.test(element.value))
		          {
		            alert(" Invalid Email! [.] dot missing ");
		            element.value="";
		            return false;
		          }
		           return true;  
		      }
		
		var nam=document.getElementById("fname");
		var email=document.getElementById("email");
		
		nam.addEventListener('blur',checkName,false);
		email.addEventListener('blur',checkMail,false);
