

function formValidation() {
	
	var isValid = true
	var email = document.register.EmailUser.value;
	if (!email.match(/^[A-Z0-9._%+-]+@[A-Z0-9.-]+\.[A-Z]{2,}$/i)) {
		 document.getElementById("USerEmail").innerHTML = "<p style= color:red;>Email is not valid. </p>";
    isValid = false;
    }
    else
    {
				document.getElementById("USerEmail").innerHTML = "";
  }
	var number = document.register.MobileNo.value;
	var phoneno = /^[1-9]\d{9}$/;
	if(!number.match(phoneno)) {
		 	document.getElementById("MblNo").innerHTML = "<p style= color:red;>Mobile number is invalid. </p>";
		    console.log("Incorrect mobile");
			isValid  = false;
		}
		else
		{
			document.getElementById("MblNo").innerHTML = "";
		}

		var inputtxt = document.register.password1.value;
        var decimal = /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[^a-zA-Z0-9])(?!.*\s).{8,15}$/;
        if (!inputtxt.match(decimal)) {
            document.getElementById("pswd").innerHTML = "<p style= color:red;>Password contains at least one Capital Letter,at least one Lowercase Letter, atleast one special carater and at least one number</p>";
            console.log("Incorrect password");
			isValid  = false;
        }
        else
		{
			document.getElementById("pswd").innerHTML = "";
		}
 	var cpass = document.register.Cpassword.value;
           if(inputtxt!=cpass){
			 document.getElementById("pswd1").innerHTML = "<p style= color:red;>Password not match.</p>";
			isValid  = false;
			}
			else
		{
			document.getElementById("pswd1").innerHTML = "";
		}
		

	return isValid;
}
/*const passwordInput = document.getElementById('password');
    const toggleBtn = document.getElementById('toggleBtn');

    toggleBtn.addEventListener('click', () => {
      if (passwordInput.type === 'password') {
        passwordInput.type = 'text';
        toggleBtn.innerHTML = '&#128064;'; // Closed eye icon
      } else {
        passwordInput.type = 'password';
        toggleBtn.innerHTML = '&#128065;'; // Open eye icon
      }
    });*/