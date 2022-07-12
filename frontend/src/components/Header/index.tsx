import "./styles.css";
import logo from "../../assets/img/logo-header.svg";

function Header() {
  return (
    <header>
      <div className="dsmeta-logo-container">
        <img src={logo} alt="DSMeta" />
        <h1>DSMeta</h1>
        <p>
          Desenvolvido por
          <a href="https://github.com/EdvanLSBJunior"target="_blank"> Edvan Lázaro</a>
        </p>
      </div>
    </header>
  );
}

export default Header;
