import DataTable from 'components/DadaTable';
import Footer from 'components/Footer';
import Navbar from 'components/Navbar';

function App() {
  return (
    <>
      <Navbar />
      <div className="container">
        <h1 className="text-primary">Vamuu</h1>  
        <DataTable />
      </div>
      <Footer />
    </>
  );
}

export default App;
