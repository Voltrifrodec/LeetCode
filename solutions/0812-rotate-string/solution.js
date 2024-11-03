// Riesenie 2: Po prechadzani rieseni ma zaujala moznost hladat goal v zlozenom retazci s+s. [O(n), T(n)]
/**
 * @param {string} s
 * @param {string} goal
 * @return {boolean}
 */
var rotateString = function(s, goal) {
	return s.length == goal.length && (s+s).includes(goal);
};
