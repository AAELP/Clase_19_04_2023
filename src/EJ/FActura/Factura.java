package EJ.FActura;

    public class Factura {
        private String nombre;
        private String cedula;
        private String elemento;
        private int numeroElementos;
        private double ValorUnidad;
        private String descripcionElemento;
        private int numeroArticulo;

        public Factura() {
            this.nombre = nombre;
            this.cedula = cedula;
            this.elemento = elemento;
        }

        public Factura(String nombre, String cedula, String elemento, int numeroElementos, double valorUnidad, String descripcionElemento, int numeroArticulo) {
            this.nombre = nombre;
            this.cedula = cedula;
            this.elemento = elemento;
            this.numeroElementos = numeroElementos;
            ValorUnidad = valorUnidad;
            this.descripcionElemento = descripcionElemento;
            this.numeroArticulo = numeroArticulo;
        }

        public int getNumeroArticulo() {
            return this.numeroArticulo;
        }

        public void setNumeroArticulo(int numeroArticulo) {
            this.numeroArticulo = numeroArticulo;
        }

        public String getNombre() {
            return this.nombre;
        }

        public String getCedula() {
            return this.cedula;
        }

        public String getElemento() {
            return this.elemento;
        }

        public int getNumeroElementos() {
            return this.numeroElementos;
        }

        public double getValorUnidad() {
            return this.ValorUnidad;
        }

        public String getDescripcionElemento() {
            return this.descripcionElemento;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setCedula(String cedula) {
            this.cedula = cedula;
        }

        public void setElemento(String elemento) {
            this.elemento = elemento;
        }

        public void setNumeroElementos(int numeroElementos) {

            if (numeroElementos<=0){
                numeroElementos=0;
                this.numeroElementos = numeroElementos;
            }else {
                this.numeroElementos = numeroElementos;
            }
        }

        public void setValorUnidad(double valorUnidad) {

            if (valorUnidad<=0){
                valorUnidad=0;
                this.ValorUnidad = valorUnidad;
            }else {
                this.ValorUnidad = valorUnidad;
            }
        }

        public void setDescripcionElemento(String descripcionElemento) {
            this.descripcionElemento = descripcionElemento;
        }

        public double calculoValorTotalPorPieza() {
            return (double)this.numeroElementos * this.ValorUnidad;
        }
    }

