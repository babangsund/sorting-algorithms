/*
 * Recursive
 */
function merge(a,b) {
  if (a.length === 0 && b.length > 0) return b;
  if (b.length === 0 && a.length > 0) return a;

  const [ah, ...at] = a;
  const [bh, ...bt] = b;

  if (ah < bh) return [ah, ...merge(at, b)]
  else return [bh, ...merge(a, bt)]
}

function rec_msort(array) {
  if (array.length < 2) return array;

  const length = array.length / 2;
  const left = array.slice(0,length);
  const right = array.slice(length);

  return merge(rec_msort(left), rec_msort(right))
}
