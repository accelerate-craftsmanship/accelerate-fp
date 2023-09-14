const fs = require('fs');

export function countSourceLines(file) {
    var data = fs.readFileSync(file, 'utf8');
    var lines = data.split("\n");
    var counter = 0;
    for (var i = 0; i < lines.length; i++) {
         var line = lines.at(i);
         if (line.trim() !== "") {
              counter++;
         }
    }
    return counter;
}