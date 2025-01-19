import random

# Define the function to be optimized (you can replace this with any function you want to maximize)
def objective_function(x):
    return -x**2 + 5*x  # Example function: -x^2 + 5x

def hill_climbing(initial_solution, step_size, iterations):
    current_solution = initial_solution
    current_value = objective_function(current_solution)

    for _ in range(iterations):
        # Generate a random neighboring solution
        neighbor_solution = current_solution + random.uniform(-step_size, step_size)
        neighbor_value = objective_function(neighbor_solution)

        # Check if the neighbor solution is better than the current solution
        if neighbor_value > current_value:
            current_solution = neighbor_solution
            current_value = neighbor_value

    return current_solution, current_value

if __name__== "__main__":
    initial_solution = random.uniform(-10, 10)  # Random initial solution between -10 and 10
    step_size = 0.1  # Size of the steps to take in each iteration
    iterations = 100  # Number of iterations

    best_solution, best_value = hill_climbing(initial_solution, step_size, iterations)

    print("Best solution:", best_solution)
    print("Best value:", best_value)