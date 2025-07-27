import React from 'react';

class CountPeople extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      entryCount: 0,
      exitCount: 0,
    };
  }

  updateEntry = () => {
    this.setState((prevState) => ({
      entryCount: prevState.entryCount + 1,
    }));
  };

  updateExit = () => {
    this.setState((prevState) => ({
      exitCount: prevState.exitCount + 1,
    }));
  };

  render() {
    return (
      <div style={{ textAlign: 'center', padding: '50px' }}>
        <h2>🛒 Mall Entry-Exit Counter</h2>
        <p><strong>People Entered:</strong> {this.state.entryCount}</p>
        <p><strong>People Exited:</strong> {this.state.exitCount}</p>
        <button onClick={this.updateEntry} style={{ margin: '10px', padding: '10px 20px' }}>
          Login
        </button>
        <button onClick={this.updateExit} style={{ margin: '10px', padding: '10px 20px' }}>
          Exit
        </button>
      </div>
    );
  }
}

export default CountPeople;
