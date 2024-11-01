var makeFancyString = function(s) {
    
    let res = "";
	let count = 1;

	for (let i = 1; i < s.length + 1; i++) {
		// Ako prva pojde porovnavacia podmienka
		if (s[i - 1] == s[i])
			count++
		else {
			count = 1;
		}
		
		// Ak je pocet vacsi ako nula, tak ignoruj, inak vloz znak do vysledku (kedze sa vyskytol len raz)
		if (count > 2) {
			continue
		}
		res += s[i - 1];
	}
	
	return res;
    
};
