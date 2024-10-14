package com.snipe.learning.lambdaexp;

//import java.util.concurrent.CompletableFuture;

public class TestCompletableFuture {

/*	public static void main(String[] args) {
		// Create a CompletableFuture that completes with a result
		CompletableFuture<String> future1 = CompletableFuture.completedFuture(“Hello World!”);
		// Asynchronously run a task and get the result
		CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
			try {
				Thread.sleep(2000);
			} catch(InterruptedException e)
			e.printStackTrace();
		}
		return “Async result”;
		});
		// Perform an action when both futures complete
		CompletableFuture<Void> combinedfuture = future1.thenCombine(future2, (result1, result2) -> {
			System.out.println(result1);
			System.out.println(result2);
			return null;
		});
		// Handle exceptions if any
		combinedfuture.exceptionally(ex -> {
			System.out.println("Exception occurred : "+ex.getMessage());
			return null;
		});
		try {
			// Wait for combinedFuture to complete and handle exception
			combinedfuture.get();
		} catch(InterruptedException | ExecutionException e)
		e.printStackTrace();
	}
	*/

}
