var exec = require('cordova/exec');

exports.printLog = function (arg0, success, error) {
    exec(success, error, 'LogDemo', 'printLog', [arg0]);
};
