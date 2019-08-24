let store = {};
let subscribtions = [];

export default {
  listen(storeName, callback) {
    subscribtions.push({
      storeName,
      execute: callback,
    });
  },

  dispatch(storeName, value) {
    store[storeName] = value;
    subscribtions.forEach(subscribtion => {
      if (subscribtion.storeName === storeName) {
        subscribtion.execute(value);
      }
    });
  },
};
