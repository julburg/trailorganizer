module.exports = {
    mode: 'development',
    entry: __dirname + '/src/js/app.js',
    resolve: {
        extensions: [
            '.js'
        ]
    },
    output: {
        path: __dirname + '/../target/classes/static/js/',
        publicPath: '/js/',
        filename: 'app.js'
    }
};