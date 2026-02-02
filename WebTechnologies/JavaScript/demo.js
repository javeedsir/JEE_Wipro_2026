

function findAge(){


        x =    document.getElementById("dob").value ;

         var   dobYear =  new Date(x).getFullYear();

        console.log(dobYear);

           var age =     new Date().getFullYear() - dobYear ;

           console.log(age)

            document.getElementById("age").value = age;

}