var i = -1;
if ( i > 0) {
console.log("Hello, world!");  
} else {
    console.log("HaHa~~~");
}

greeting("홍길동");
greeting("유관순");
greeting("김영이");

function greeting(n) {
    console.log(n + "님 반갑습니다!");
}