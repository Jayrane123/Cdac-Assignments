let container = document.getElementById("container").style;
container.display = "flex";
container.flexDirection = "column";
container.alignItems = "center";
container.justifyContent = "center";
container.height = "100vh";

let headingEl = document.getElementById("h1");
let heading = headingEl.style;
heading.color = "blue";
heading.fontSize = "30px";
heading.backgroundColor = "lightyellow";
heading.padding = "10px";
heading.borderRadius = "6px";

let pEl = document.getElementById("p");
let p1 = pEl.style;
p1.color = "brown";
p1.marginTop = "1.5rem";
p1.textAlign = "center";
p1.width = "60%";

let button = document.getElementById("but");
let b = button.style;
b.marginTop = "2rem";
b.padding = "10px 20px";
b.border = "2px solid orange";
b.backgroundColor = "lightblue";
b.cursor = "pointer";

button.onclick = function () {
  p1.fontSize = "30px";
  p1.color = "darkgreen";
  headingEl.style.color = "red";
};

