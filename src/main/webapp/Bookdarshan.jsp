<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book Darshan</title> 
  <link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet"
        integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
    <link rel="stylesheet" href="style.css">
    <link href="css/Donation.css" rel="stylesheet">
     <link rel="stylesheet" href="js/Donation.js">
     

</head>
<body style="background-color: #f5f5f5;
  font-family: Arial, Helvetica, sans-serif;
  background-image: url('images/temple1.png');
  background-repeat: no-repeat;
  background-size:2000px;">
     <div class="wrapper">
        <h3>Book Darshan</h3>
        <form method="POST" action="Donation">
            <h4>Details</h4>
            <div class="input-group">
                <div class="input-box">
                    <input type="text" placeholder="Full Name" name="fullname" required class="name" onkeydown="return /[a-zA-Z]/i.test(event.key)">
                    <i class="fa fa-user icon"></i>
                </div>
                <div class="input-box">
                    <input type="number" name="mobileno" placeholder="Mobile No." required class="name" onKeyDown="if(this.value.length==10) return false;">
                    
                    <i class="fa fa-phone icon"></i>
                </div>
            </div>
            <div class="input-group">
                <div class="input-box">
                    <input type="text" placeholder="Address" name="address" required class="name" onkeydown="return /[a-zA-Z0-9_]/i.test(event.key)">
                    <i class="fa fa fa-address-card-o icon"></i>
                </div>
            </div>
            <div class="input-group">
                <div class="input-box">
                    <h4> Date</h4>
                    <input type="number" name="date" placeholder="DD" class="dob" onKeyDown="if(this.value.length==2) return false;" required>
                    <input type="number" name="month" placeholder="MM" class="dob"required onKeyDown="if(this.value.length==2) return false;">
                    <input type="number" name="year" placeholder="YYYY" class="dob" onKeyDown="if(this.value.length==4) return false;" required>
                </div>
                <div class="input-box">
                    <h4> Gender</h4>
                    <input type="radio" id="b1" name="gendar" checked class="radio">
                    <label for="b1">Male</label>
                    <input type="radio" id="b2" name="gendar" class="radio">
                    <label for="b2">Female</label>
                </div>
            </div>
            <div class="input-group">
                <div class="input-box">
                    <h4>Payment Details</h4>
                    <img src="images/payment1.jfif">
                    <input type="radio" name="pay" id="bc1" checked class="radio">
                    <label for="bc1"><span>Credit Card</span></label>
                    <input type="radio" name="pay" id="bc2" class="radio">
                    <label for="bc2"><span>Debit Card</span></label>
                </div>
                 <div class="input-group" >
              <img src="images/price.jpeg" width="100px" height="15px">
            </div>
            </div>
           
            <div class="input-group">
                <div class="input-box">
                    <input type="tel" name="cardname" placeholder="Card Name" required class="name" onkeydown="return /[a-zA-Z]/i.test(event.key)">
                    <i class="fa fa-user icon"></i>
                </div>
            </div>
            <div class="input-group">
                <div class="input-box">
                    <input type="tel" placeholder="Card Number" name="cardnumber" class="name" onKeyDown="if(this.value.length==16) return false;">
                    <i class="fa fa-credit-card icon"></i>
                </div>
                <div class="input-box">
                    <input type="tel" placeholder="Card CVC" name="cardcvc" required class="name" onKeyDown="if(this.value.length==3) return false;">
                    <i class="fa fa-user icon"></i>
                </div>
            </div>
            <div class="input-group">
                <div class="input-box">
                    <button type="submit"  id="btnShowMsg" onClick="showMessage()">Pay Now</button>
                </div>
            </div>
        </form>
    </div>
    <script type="text/javascript">
    function showMessage() {
        alert("Thank You For Booking.... Process Successfully.....!");
    }
    </script>
</body>
</html>



              
             
         
           
    


