

function greet(name){

    if (name === undefined){
        return "Hello, there";
    }
    if (typeof name === "object" ) {
        let str = "Hello"
        for (let i=0; i < name.length; i++){
            str += ", " + name[i]
        }
        return str;
    }
    else {
        if (name === name.toUpperCase()){
            return "HELLO, " + name;
        }
        else {
            return "Hello, " + name;
        }
    }
}


