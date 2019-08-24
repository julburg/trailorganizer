export default {
    draw(trails) {
        console.log('drawing trails '+ trails)
        console.log('huhu'+document);
        const root = document.getElementById("all-trails");
        var tbl = document.createElement("table");
        var tblBody = document.createElement("tbody");


        trails.forEach(trail => {

            var row = document.createElement("tr");
            var cellName = document.createElement("td");
            var cellNameText = document.createTextNode(trail.name);
            cellName.appendChild(cellNameText);
            row.appendChild(cellName);

            var cellDistance = document.createElement("td");
            var cellDistanceText = document.createTextNode(trail.distance);
            cellDistance.appendChild(cellDistanceText);
            row.appendChild(cellDistance);

            tblBody.appendChild(row);
        });

        tbl.appendChild(tblBody);
        root.appendChild(tbl);
        tbl.setAttribute("border", "2");
    },

};
