Handlebars.registerHelper('ifMatch', function(inputText, matchText, options) {
    if(inputText === matchText) {
        return options.fn(this);
    }
    return options.inverse(this);
});

Handlebars.registerHelper('ifMatchTwo', function(inputText, matchText, inputText2, matchText2, options) {
    if(inputText === matchText && inputText2 === matchText2) {
        return options.fn(this);
    }
    return options.inverse(this);
});

// inputText와 matchValue가 일치하면, inputText를 replaceText로 변경
// 예를들면 default_yn === "Y" ==> "on" 으로 변경
Handlebars.registerHelper('replace', function(inputText, matchValue, replaceText, options) {
    var string = '';
    if(inputText === matchValue) {
        string = replaceText;
    }
    return string;
});

Handlebars.registerHelper('indexCompare', function(index, pageNo, options) {
    if(index == pageNo) {
        return true;
    } else {
        return false;
    }
});

Handlebars.registerHelper('getPrefix', function(viewType, layerKey) {
	var string = '';
	switch(viewType) {
		case 'wms': string = 'base_layer'; break;
		case 'wfs':
		case 'data': string = layerKey; break;
		case 'tile':
		case 'canvas': string = viewType + '_' + layerKey;
	}
    return string;
});