(* Recursive *)
let rec isort = function
  | [] -> [elem]
  | h::t -> insert h (isort t)
and insert elem = function
  | [] -> [elem]
  | h::t -> if elem <= h then elem :: h :: t
            else h :: insert elem t
