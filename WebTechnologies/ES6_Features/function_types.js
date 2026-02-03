

function  f1(){

    console.log("Normal Function");

}

    f1();

  const   fun2 =  ()=>{

        console.log("this is arrow function");

    }

    // f2 = ()=>{

    //             console.log("arrow function hacked..");
    // }

    fun2();


    function  add(a , b =1){

            return a+b;

    }


    result = add(5);

    console.log(result);


    
   function   f4(name , ...x){

        console.log('f4() is called..');
        console.log(x.length);

   }

    f4('javeed');
    f4('king',1,2);
    f4('tom',1,2,3)





