const Board = () => {
  const [player, setPlayer] = React.useState(1);
  let status = `Player ${player}`;
  return (
    <div
      className="game-board"
      onClick={(e) => {
        setPlayer(((player)%2)+1);
        status = `Player ${player}`;
        if( player === 2) {
            e.target.style.backgroundColor = "red";
        }
        else{
            e.target.style.backgroundColor = "#34495e";
        }
      }}
    >
      <div id="info">
        <h1 style={{color: "white"}}>{status}</h1>
      </div>
    </div>
  );
};

// ========================================

ReactDOM.render(<Board />, document.getElementById("root"));
