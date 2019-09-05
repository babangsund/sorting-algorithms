""" Insertion sort """


"""Recursive"""


def insert(elem, array):
    if len(array) == 0:
        return [elem]
    else:
        head, tail = array[0], array[1:]
        if elem <= head:
            return [elem, head, *tail]
        else:
            return [head, *insert(elem, tail)]


def rec_isort(array):
    if len(array) == 0:
        return array
    else:
        head, tail = array[0], array[1:]
        return insert(head, rec_isort(tail))


"""Iterative"""


def iter_isort(array):
    for index in range(1, len(array)):
        value = array[index]
        test = index - 1

        while test > -1 and array[test] > value:
            array[test + 1] = array[test]
            test -= 1
        array[test + 1] = value

    return array
