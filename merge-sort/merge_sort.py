"""
Recursive
"""


def merge_sort(l):
    length = len(l)

    if length < 2:
        return l

    left = l[: length // 2]
    right = l[length // 2:]

    return merge(merge_sort(left), merge_sort(right))


def merge(a, b):
    a_len = len(a)
    b_len = len(b)

    if a_len == 0 and b_len > 0:
        return b
    if b_len == 0 and a_len > 0:
        return a

    ah, *at = a
    bh, *bt = b

    if ah < bh:
        return [ah] + merge(at, b)
    else:
        return [bh] + merge(a, bt)
