function Todo({todo,index, setTodos, todos}){
  const removeTodo = index => {
    let temp = [...todos];
    temp.splice(index, 1);
    setTodos(temp);
  }
  function handle(){
    console.log('Ping:',index);
    removeTodo(index);
  }
  return <div className="todo" onClick={handle}>{todo.text} (-)</div>
}
