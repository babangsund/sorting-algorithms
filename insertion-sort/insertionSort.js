/**
 * Recursive
 */
function insert(elem, array) {
  if (!array.length) return [elem];
  else {
    const [head, ...tail] = array;
    if (elem <= head) return [elem].concat(head).concat(tail);
    else return [head].concat(insert(elem, tail));
  }
}
export function rec_isort(array) {
  if (!array.length) return array;
  else {
    const [head, ...tail] = array;
    return insert(head, rec_isort(tail));
  }
}

/**
 * Iterative
 */
export function iter_isort(array) {
  let i = 0;

  while (array[i]) {
    const value = array[i];
    let test = i - 1;

    while (test > -1 && array[test] > value) {
      array[test + 1] = array[test];
      test -= 1;
    }

    array[test + 1] = value;
    i++;
  }

  return array;
}
