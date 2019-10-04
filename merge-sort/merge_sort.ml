(* Recursive *)

let rec merge_sort = function
  | []
  | [_] as l -> l
  | l ->
      let a, b = halve l in
        merge (merge_sort a, merge_sort b)
and halve = function
  | []
  | [_] as ta -> ta, []
  | h::t ->
      let ta, tb = halve t in
        h::tb, ta
and merge = function
  | l, []
  | [], l -> l
  | ha::ta, hb::tb ->
      if ha <= hb then
        ha :: merge (ta, hb::tb)
      else
        hb :: merge (ha::ta, tb)
;;
