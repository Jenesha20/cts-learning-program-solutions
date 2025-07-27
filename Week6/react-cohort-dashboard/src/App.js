import React from 'react';
import CohortDetails from './components/CohortDetails';

const cohorts = [
  { name: 'React Bootcamp', status: 'ongoing', startDate: '2025-07-01', endDate: '2025-09-01' },
  { name: 'Node.js Training', status: 'completed', startDate: '2025-04-01', endDate: '2025-06-01' },
];

function App() {
  return (
    <div style={{ padding: '20px' }}>
      <h2>My Academy Cohorts</h2>
      {cohorts.map((cohort, index) => (
        <CohortDetails key={index} cohort={cohort} />
      ))}
    </div>
  );
}

export default App;
