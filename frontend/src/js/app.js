import {allTrails} from './service/trailservice';
import store from './store';
import trails from './views/trails';

document.addEventListener("DOMContentLoaded", function (event) {
    console.log("DOM fully loaded and parsed");

    store.listen("trails", data => {
        this.data = data;
        if (!!this.data) {
            render(this.data);
        }
    });

    allTrails();

    function render(data) {
        trails.draw(JSON.parse(data));
    }

});
