requstAjax(function (data)) {
	data = { who: '택배' , when: '도착'};
	var result = getPpopo(data);

	$('#result').html(result);
});

function getPpopo(data) {
	return data.who + '가' + data.when + '할 때 뽀뽀뽀~';
}

var tmplStr = '{who}가 {when}할 때 뽀뽀뽀~';
var result = replaceTemplate(tmplStr,data);
$('#result').html(result);

function replceTemplate(tmplStr, data) {
	var result = tmplStr;
	for (var key in data) {
			result = result.replace('{' + key + '}' , data[key]);
		}
	return result;
}


var tmplStr = loadTemplate('ppopo');
var result = replacePpopo(tmplStr,data);
$('#result').html(result);

function loadTemplate(id) {
	return document.getElementById(id).innerHTML;
}