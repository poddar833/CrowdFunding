function counter1(time , url){
   var interval = setInterval(function(){
       time = time-1;
       if(time==0){
           window.location=url;
           
       }
   } , 1000);
    
}
$(document).ready(function(){  
   counter1(1, "index.jsp");
});

