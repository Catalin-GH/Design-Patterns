public class Context
{ 
    // reference to Operation interface so that client can choose between operation types(+, -, *)
    private Operation operation;
    
    // client needs to provide what type of operation should be called
    public void setOperation(Operation operation)
    {
        this.operation = operation;
    }
    
    // calculate the operation 
    public int operation(int a, int b)
    {
        return this.operation.algorithm(a, b);
    }
}
