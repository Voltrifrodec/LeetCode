/**
 * @param {string} s
 * @return {number}
 */
var minChanges = function(s) {
    // Ak je dlzka retazca neparna (alebo nulova), vrat vysledok 0
    if(s.length % 2 != 0)
        return 0;

	// Beautiful string: Ked vieme rozdelit binarny retazec na
	// dvojice identickych znakov (?) -- napr. "1100" -> "11|00"
	let num_changes = 0;

    // Prechod retazca pomocou cykla for, s velkostou kroku 2
    // (vytvorenie "parov")
	for (let i = 0; i < s.length; i += 2) {
		// Ak je prvy znak z paru vacsi ako druhy, alebo druhy znak vacsi ako prvy,
        // potom musime vykonat zmenu
        if (s[i] != s[i + 1]) {
			num_changes++;
		}
	}

    // Vratenie vysledku
	return num_changes;
};
