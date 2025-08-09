import { CalculateScore } from './components/CalculateScore';

function App() {
  return (
    <div>
      <CalculateScore
        Name={"Yuvasri"}
        School={"Immaculate Higher Secondary School"}
        total={550}
        goal={6}
      />
    </div>
  );
}
export default App;
