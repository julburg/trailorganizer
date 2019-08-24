export default {
    draw(trails) {
        console.log('drawing trails ' + trails)
        const root = document.getElementById("all-trails");
        var list = document.createElement("ul");

        trails.forEach(trail => {
            var listElement = document.createElement("li");
            var listTxt = document.createTextNode(trail.name + ' ' + trail.distance);
            listElement.appendChild(listTxt)
            list.appendChild(listElement);
        });

        list.addEventListener('click', function (ev) {
            console.log(ev);
            var div = document.createElement("div");
            var txt = document.createTextNode('huhu');
            div.appendChild(txt)

            ev.target.appendChild(div);

        }, false);

        root.appendChild(list);
    },

};
