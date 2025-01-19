def is_safe(board, row, col, N):
    # Check if there is a queen in the same row
    for i in range(col):
        if board[row][i] == 1:
            return False

    # Check if there is a queen in the upper diagonal
    for i, j in zip(range(row, -1, -1), range(col, -1, -1)):
        if board[i][j] == 1:
            return False

    # Check if there is a queen in the lower diagonal
    for i, j in zip(range(row, N, 1), range(col, -1, -1)):
        if board[i][j] == 1:
            return False

    return True


def solve_nqueens_util(board, col, N):
    if col >= N:
        return True

    for i in range(N):
        if is_safe(board, i, col, N):
            board[i][col] = 1

            if solve_nqueens_util(board, col + 1, N):
                return True

            board[i][col] = 0

    return False


def solve_nqueens(N):
    # Initialize the board
    board = [[0 for _ in range(N)] for _ in range(N)]

    if not solve_nqueens_util(board, 0, N):
        print("Solution does not exist")
        return

    # Print the solution
    print_solution(board)


def print_solution(board):
    for row in board:
        print(" ".join(map(str, row)))


# Example: Solve the 8-Queens problem
solve_nqueens(8)