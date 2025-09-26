def minMoves(h, w, h1, w1):
    def count_folds(from_size, to_size):
        folds = 0
        while from_size > to_size:
            from_size = (from_size + 1) // 2  
            folds += 1
        return folds

    folds_h = count_folds(h, h1)
    folds_w = count_folds(w, w1)

    return folds_h + folds_w
print(minMoves(8, 4, 6, 1))  
print(minMoves(2, 3, 2, 2))