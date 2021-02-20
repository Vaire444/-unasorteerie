var apples = [29, 70, 85, 77, 55, 44, 33, 98, 90, 47, 22, 44, 55, 37, 65];
var small = 0;
var medium = 0;
var big = 0;
var sm = [];
var med = [];
var bg = [];

for (apple in apples) {
  if (apples[apple] <= 50) {
    small++;
    sm.push(apples[apple]);
  } else if (apples[apple] < 71 && apples[apple] > 50) {
    medium++;
    med.push(apples[apple]);
  } else {
    big++;
    bg.push(apples[apple]);
  }
}

console.log("Kokku loendati enne sorteerimist " + apples.length + " õuna");
console.log("Väikseid õunu kokku " + small + " tk, massidega " + sm);
console.log("Keskmisi õunu kokku " + medium + " tk, massidega " + med);
console.log("Suuri õunu kokku " + big + " tk, massidega " + bg);
