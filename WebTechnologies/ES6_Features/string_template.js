
function f(){

    let  salary = 9000;

var  text1 =  "hello friends , how are you? "+ salary +" I am Javeed."


var text = ` this is my job designing web pages

                    ${salary}

        I am javeed            from hyderabad`;

        console.log(text)

}


f();


function destructuring(){

    const obj = {first: 'Asim', last: 'Hussain', age: 39 };


        const {first:f , last:l} = obj;

        console.log(f +"  "+ l);

}

destructuring();


