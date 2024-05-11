package java.t4.backend;
public class main {
    public static void main(String[] args) {
        System.out.println("MongoDB testing!");

        // connect to the frontend
        // generate codes to connect to the Frontend side of the app

        // send a message to the server and print
        // the response
        private Task<String> addMessage(String text) {
            // Create the arguments to the callable function.
            Map<String, Object> data = new HashMap<>();
            data.put("text", text);
            data.put("push", true);

            return mFunctions
                    .getHttpsCallable("addMessage")
                    .call(data)
                    .continueWith(new Continuation<HttpsCallableResult, String>() {
                        @Override
                        public String then(@NonNull Task<HttpsCallableResult> task) throws Exception {
                            // This continuation runs on either success or failure, but if the task
                            // has failed then getResult() will throw an Exception which will be
                            // propagated down.
                            String result = (String) task.getResult().getData();
                            return result;
                        }
                    });
        }
    }
}