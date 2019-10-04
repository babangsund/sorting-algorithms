(* Recursive *)

let rec insertion_sort = function
  | [] -> []
  | h::t -> insert h (insertion_sort t)
and insert x = function
  | [] -> [x]
  | h::t -> if x <= h then x :: h :: t
            else h :: insert x t
;;
