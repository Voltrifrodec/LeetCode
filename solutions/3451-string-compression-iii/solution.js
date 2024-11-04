// Riesenie 2: Eliminacia podmienok a uprava kodu. [O(n), T(n)]
/**
 * @param {string} word
 * @return {string}
 */
 var compressedString = function(word) {
	let comp = ""; // Premenna pre ukladanie vysledku
	
	// Zaciname od pozicie 1 v poli -- ideme po len(word) + 1
	// (aby sme skontrolovali a vypisali aj predosly znak)
	let count = 1;
	for(let i = 1; i < word.length + 1; i++) {
		// Ak je pocet opakovani znaku rovny 9, resetuj counter
		// a pridaj do vysledku '9' + znak
		if(count == 9) {
			comp += "9" + word[i - 1];
			count = 1;
			continue;
		}
		// Ak je predosly znak iny ako aktualny znak, tak resetuj counter
		// a pridaj do vysledku pocet opakovani predchadzajuceho znaku
		if (word[i - 1] != word[i]) {
			comp += count + word[i - 1];
			count = 0;
		}
		// Inkrementuj counter o 1
		count++;
	}

	// Vrat vysledok
	return comp;
};
