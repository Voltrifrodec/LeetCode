/**
 * @param {string} s
 * @param {string} goal
 * @return {boolean}
 */
var rotateString = function(s, goal) {
	if (s == goal)
		return true;

    for (let i = 0; i < s.length; i++) {
		let first_c = s[0];
		s = s.slice(1, s.length) + first_c;

		if (s == goal)
			return true;
	}
	
	return false;
};
